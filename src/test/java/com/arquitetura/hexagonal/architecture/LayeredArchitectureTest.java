package com.arquitetura.hexagonal.architecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import org.springframework.boot.test.context.SpringBootTest;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

@AnalyzeClasses(packages = "com.arquitetura.hexagonal")
public class LayeredArchitectureTest {
    @ArchTest
    public static final ArchRule layered_Architecture_test = layeredArchitecture()
            .consideringAllDependencies()
            .layer("AdaptersIn").definedBy("..adapters.in..")
            .layer("AdaptersOut").definedBy("..adapters.out..")
            .layer("UseCase").definedBy("..application.core.usecase..")
            .layer("PortsIn").definedBy("..application.ports.in..")
            .layer("PortsOut").definedBy("..application.ports.in..")
            .layer("Config").definedBy("..config..")
            .whereLayer("AdaptersIn").mayOnlyAccessLayers("Config")
            .whereLayer("AdaptersOut").mayOnlyAccessLayers("Config")
            .whereLayer("UseCase").mayOnlyAccessLayers("Config")
            .whereLayer("PortsIn").mayOnlyAccessLayers("UseCase", "AdaptersIn")
            .whereLayer("PortsOut").mayOnlyAccessLayers("UseCase", "AdaptersOut")
            .whereLayer("Config").mayOnlyAccessLayers();
}
