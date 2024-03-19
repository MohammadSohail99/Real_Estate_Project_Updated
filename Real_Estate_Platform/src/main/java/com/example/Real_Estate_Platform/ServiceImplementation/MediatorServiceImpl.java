package com.example.Real_Estate_Platform.ServiceImplementation;

import com.example.Real_Estate_Platform.Entity.Mediator;
import com.example.Real_Estate_Platform.Model.MediatorModel;

public interface MediatorServiceImpl {
    Mediator registerMediator(MediatorModel mediatorModel);

    MediatorModel loginMediator(String username, String password);
}
