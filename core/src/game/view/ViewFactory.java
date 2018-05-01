package game.view;

import java.util.HashMap;
import java.util.Map;

import game.model.EntityModel;
import game.model.EntityModel.ModelType;

public class ViewFactory {
    private static Map<EntityModel.ModelType, EntityView> cache =
            new HashMap<EntityModel.ModelType, EntityView>();

    public static EntityView makeView(EntityModel model) {
        if (!cache.containsKey(model.getModelType())) {
            if (model.getModelType() == ModelType.HERO)
                cache.put(model.getModelType(), new HeroView());
            if (model.getModelType() == ModelType.GUARD)
                cache.put(model.getModelType(), new GuardView());
            if (model.getModelType() == ModelType.OGRE)
                cache.put(model.getModelType(), new OgreView());
            if (model.getModelType() == ModelType.SLUG)
                cache.put(model.getModelType(), new SlugView());
        }
        return cache.get(model.getModelType());
    }
}