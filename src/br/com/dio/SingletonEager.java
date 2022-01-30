package br.com.dio;

public class SingletonEager {
        private static SingletonEager instancia;

        private SingletonEager(){
            super();

        }

        public static br.com.dio.SingletonEager getInstancia() {
            if (instancia == null){
                instancia = new SingletonEager();
            }
            return instancia;
        }




}
