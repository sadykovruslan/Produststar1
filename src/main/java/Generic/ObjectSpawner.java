package Generic;

public class ObjectSpawner <C>{
    private Class <C> clazz;

    public ObjectSpawner(Class<C> classC) {
        this.clazz = clazz;

    }
    public C create() throws InstantiationException, IllegalAccessException {
        return clazz.newInstance();
    }

}
