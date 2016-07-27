package com.nihed.mloukhiya.service;


import com.nihed.mloukhiya.domain.ModelInformation;

public interface ModelService {

    public ModelInformation addModel(ModelInformation model);

    public ModelInformation getModel(String id);

}
