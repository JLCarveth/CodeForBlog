public class JavaClassTest {

    public class User {
        private String name;
        private Address address;
        private int age;

        public User(String name, Address address, int age) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public void happyBirthday() { age++;}

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }
    }

    public class Address {
        private int streetNum;
        private String street;
        private String postalCode;
        private Country country;

        public Address(int streetNum, String street, String postalCode, Country country) {
            this.streetNum = streetNum;
            this.street = street;
            this.postalCode = postalCode;
            this.country = country;
        }

        public int getStreetNum() {
            return streetNum;
        }

        public void setStreetNum(int streetNum) {
            this.streetNum = streetNum;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public void setPostalCode(String postalCode) {
            this.postalCode = postalCode;
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }

        public String toString() {
            return String.valueOf(streetNum) + street + ", " + postalCode + ", " + country;
        }
    }

    public class Country {
        private String name;

        public Country(String name) { this.name = name; }

        public String getName() {
            return this.name;
        }

        public String toString() { return name; }
    }
}
