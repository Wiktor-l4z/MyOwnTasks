package builder;

public class Dog {
    private String name;
    private int age;
    private boolean healty;

    private Dog(final Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.healty = builder.healty;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isHealty() {
        return healty;
    }

    public static class Builder {
        private String name;
        private int age;
        private boolean healty;

        public Builder(final String name) {
            this.name = name;
        }

        public Builder age (final int age){
            this.age = age;
            return this;
        }

        public Builder healty (final boolean healty){
            this.healty = healty;
            return this;
        }

        public Dog build(){
            return  new Dog(this);
        }
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", healty=" + healty +
                '}';
    }
}
