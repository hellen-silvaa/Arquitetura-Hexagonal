package com.arquitetura.hexagonal.architecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "com.arquitetura.hexagonal")
public class NamingConventionTest {

    @ArchTest
    public static final ArchRule consumer_reside_only_consumer_package = classes()
            .that()
            .haveNameMatching(".*Consumer")
            .should()
            .resideInAnyPackage("..adapters.in.consumer")
            .as("Consumer classes reside inside consumer package in adapters.in pa");

    @ArchTest
    public static final ArchRule mapper_reside_only_mapper_package = classes()
            .that()
            .haveNameMatching(".*Mapper")
            .should()
            .resideInAnyPackage("..adapters.in.mapper", "..adapters.in.controller.mapper", "..adapters.out.client.mapper", "..adapters.out.repository.mapper")
            .as("Mapper classes should reside inside mapper package in controller, client, consumer or repository packages");
}
