package br.edu.utfpr.moraesfausto.englishschool.model.vo;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Payment.class)
public abstract class Payment_ {

	public static volatile SingularAttribute<Payment, LocalDate> paymentDay;
	public static volatile SingularAttribute<Payment, Student> student;
	public static volatile SingularAttribute<Payment, PaymentTypes> PaymentType;
	public static volatile SingularAttribute<Payment, Long> id;
	public static volatile SingularAttribute<Payment, Float> value;

}

