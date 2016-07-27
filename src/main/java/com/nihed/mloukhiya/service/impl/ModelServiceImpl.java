package com.nihed.mloukhiya.service.impl;

import com.nihed.mloukhiya.domain.ModelInformation;
import com.nihed.mloukhiya.service.ModelService;

import java.util.HashMap;
import java.util.Map;


public class ModelServiceImpl implements ModelService {

    private Map<String, ModelInformation> models = new HashMap<String, ModelInformation>();

    @Override
    public ModelInformation addModel(ModelInformation model) {
        models.put(model.getId(), model);
        return model;
    }

    @Override
    public ModelInformation getModel(String id) {
        return models.get(id);
    }
}
