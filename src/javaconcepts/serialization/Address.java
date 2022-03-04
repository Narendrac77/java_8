package src.javaconcepts.serialization;
//f a class contains objects of other classes, then those classes should also implement Serializable interface,
// otherwise the containing class can not be serialized.
// For e.g., Student class contains Address and if Address does not implement Serializable interface,
// then it throws a NotSerializableException if we try to serialize an object of Student class
public class Address {

    private String doorNumber;
    private String line1;

}
