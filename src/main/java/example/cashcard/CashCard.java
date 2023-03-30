package example.cashcard;

/*
From Baeldung
Records are immutable data classes that require only the type and name of fields. The equals, hashCode, and toString methods, as well as the private, final fields and public constructor, are generated by the Java compiler
*/
public record CashCard(Long id, Double amount) {
}