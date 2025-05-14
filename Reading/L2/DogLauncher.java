public class DogLauncher {
            public static void main(String[] args) {
                Dog d1 = new Dog(10, "dog1");
                Dog d2 = new Dog(20, "dog2");
                System.out.println(d1.maxDog(d2));
            }
        }