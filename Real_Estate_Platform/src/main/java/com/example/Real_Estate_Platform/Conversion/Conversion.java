package com.example.Real_Estate_Platform.Conversion;

import com.example.Real_Estate_Platform.Entity.Buyer;
import com.example.Real_Estate_Platform.Entity.Mediator;
import com.example.Real_Estate_Platform.Entity.Property;
import com.example.Real_Estate_Platform.Entity.Seller;
import com.example.Real_Estate_Platform.Model.BuyerModel;
import com.example.Real_Estate_Platform.Model.MediatorModel;
import com.example.Real_Estate_Platform.Model.PropertyModel;
import com.example.Real_Estate_Platform.Model.SellerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class Conversion {
    @Autowired
    private PasswordEncoder passwordEncoder;
    public BuyerModel entity_buyerModel(Buyer buyer) {
        BuyerModel buyerModel=new BuyerModel();
        buyerModel.setBid(buyer.getBid());
        buyerModel.setBname(buyer.getBname());
        buyerModel.setMobile(buyer.getMobile());
        buyerModel.setEmail(buyer.getEmail());
        buyerModel.setAddress(buyer.getAddress());
        buyerModel.setMediator(buyer.getMediator());
        buyerModel.setUsername(buyer.getUsername());
        buyerModel.setPassword(buyer.getPassword());
        buyerModel.setRole("BUYER");
        return  buyerModel;
    }
    public Buyer buyerModel_entity(BuyerModel buyerModel) {
        Buyer buyer=new Buyer();
        buyer.setBid(buyerModel.getBid());
        buyer.setBname(buyerModel.getBname());
        buyer.setMobile(buyerModel.getMobile());
        buyer.setMobile(buyerModel.getMobile());
        buyer.setEmail(buyerModel.getEmail());
        buyer.setAddress(buyerModel.getAddress());
        buyer.setMediator(buyerModel.getMediator());
        buyer.setPassword(passwordEncoder.encode(buyerModel.getPassword()));
        buyer.setUsername(buyerModel.getUsername());
        buyer.setRole("BUYER");
        return buyer;
    }
    public MediatorModel entity_mediatorModel(Mediator mediator) {
        MediatorModel mediatorModel=new MediatorModel();
        mediatorModel.setMid(mediator.getMid());
        mediatorModel.setMobile(mediator.getMobile());
        mediatorModel.setPassword(mediator.getPassword());
        mediatorModel.setUsername(mediator.getUsername());
        mediatorModel.setEmail(mediator.getEmail());
        mediatorModel.setSellerList(mediator.getSellerList());
        mediatorModel.setMname(mediator.getMname());
        mediatorModel.setRole("MEDIATOR");
        return mediatorModel;
    }

    public Mediator mediatorModel_entity(MediatorModel mediatorModel) {
        Mediator mediator=new Mediator();
        mediator.setMid(mediatorModel.getMid());
        mediator.setMname(mediatorModel.getMname());
        mediator.setPassword(passwordEncoder.encode(mediatorModel.getPassword()));
        mediator.setMobile(mediatorModel.getMobile());
        mediator.setUsername(mediatorModel.getUsername());
        mediator.setMobile(mediatorModel.getMobile());
        mediator.setSellerList(mediatorModel.getSellerList());
        mediator.setEmail(mediatorModel.getEmail());
        mediator.setRole("MEDIATOR");
        return mediator;
    }
    public PropertyModel entity_propertyModel(Property property){
        PropertyModel propertyModel=new PropertyModel();
        propertyModel.setId(property.getId());
        propertyModel.setTitle(property.getTitle());
        propertyModel.setArea(property.getArea());
        propertyModel.setSeller(property.getSeller());
        propertyModel.setPrice(property.getPrice());
        propertyModel.setIsSold(property.isSold());
        propertyModel.setAddress(property.getAddress());
        propertyModel.setStatus(property.getStatus());
        return  propertyModel;
    }
    public Property propertyModel_entity(PropertyModel propertyModel){
        Property property=new Property();
        property.setId(propertyModel.getId());
        property.setTitle(propertyModel.getTitle());
        property.setAddress(propertyModel.getAddress());
        property.setPrice(propertyModel.getPrice());
        property.setSeller(propertyModel.getSeller());
        property.setSeller(propertyModel.getSeller());
        property.setSold(propertyModel.getIsSold());
        property.setArea(propertyModel.getArea());
        property.setStatus(propertyModel.getStatus());
        return property;
    }
    public SellerModel entity_sellerModel(Seller seller) {
        SellerModel sellerModel=new SellerModel();
        sellerModel.setSid(seller.getSid());
        sellerModel.setSname(seller.getSname());
        sellerModel.setEmail(seller.getEmail());
        sellerModel.setMobile(seller.getMobile());
        sellerModel.setPropertyList(seller.getPropertyList());
        sellerModel.setMediator(seller.getMediator());
        sellerModel.setUsername(seller.getUsername());
        sellerModel.setPassword(seller.getPassword());
        sellerModel.setRole("SELLER");
        return sellerModel;
    }

    public Seller sellerModel_entity(SellerModel sellerModel) {
        Seller seller=new Seller();
        seller.setSid(sellerModel.getSid());
        seller.setSname(sellerModel.getSname());
        seller.setEmail(sellerModel.getEmail());
        seller.setMobile(sellerModel.getMobile());
        seller.setPropertyList(sellerModel.getPropertyList());
        seller.setMediator(sellerModel.getMediator());
        seller.setPassword(passwordEncoder.encode(sellerModel.getPassword()));
        seller.setUsername(sellerModel.getUsername());
        seller.setRole("SELLER");
        return seller;
    }
}
