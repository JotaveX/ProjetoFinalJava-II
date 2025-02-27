/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.moraesfausto.englishschool.model.vo;

import java.time.LocalDate;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author f4ustx
 */
@Entity
@Table(name="payment")
public class Payment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private float value;
    
    private PaymentTypes PaymentType;
    
    private LocalDate paymentDay;
    
    @ManyToOne
    private Student student;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
        public LocalDate getPaymentDay() {
        return paymentDay;
    }

    public void setPaymentDay() {
        this.paymentDay = LocalDate.now();
    }
    
        public PaymentTypes getPaymentType() {
        return PaymentType;
    }

    public void setPaymentType(PaymentTypes PaymentType) {
        this.PaymentType = PaymentType;
    }

}
