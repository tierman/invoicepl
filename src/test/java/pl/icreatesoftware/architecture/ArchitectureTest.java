package pl.icreatesoftware.architecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "pl.icreatesoftware")
public class ArchitectureTest {

    @ArchTest
    public static final ArchRule myRule = classes()
            .that().resideInAPackage("..ports..")
            .should().haveSimpleNameEndingWith("Port");
}
