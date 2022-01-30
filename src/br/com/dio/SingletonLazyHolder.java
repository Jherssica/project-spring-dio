package br.com.dio;

public class SingletonLazyHolder {

    private static SingletonLazyHolder Instancia;

    public static class InstanceHolder {
            private static SingletonLazyHolder InstanceHolder;

        }


        private SingletonLazyHolder(){
            super();

        }

    public static SingletonLazyHolder getInstancia() {
        return Instancia;
    }



}
