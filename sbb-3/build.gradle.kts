import org.gradle.kotlin.dsl.developmentOnly
import org.gradle.kotlin.dsl.runtimeOnly
import org.gradle.kotlin.dsl.testImplementation

plugins {
    java
    id("org.springframework.boot") version "4.0.3"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "com.mysite"
version = "0.0.1-SNAPSHOT"
description = "sbb-3"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

repositories {
    mavenCentral()
}

//dependencies {
//    runtimeOnly ("com.h2database:h2")
//    implementation("org.springframework.boot:spring-boot-h2console")
//    implementation("org.springframework.boot:spring-boot-starter-web")
//    implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
//    implementation ("org.springframework.boot:spring-boot-starter-thymeleaf")
//    implementation ("nz.net.ultraq.thymeleaf:thymeleaf-layout-dialect:4.0.0")
//    implementation ("org.springframework.boot:spring-boot-starter-validation")
//    compileOnly("org.projectlombok:lombok")
//    developmentOnly("org.springframework.boot:spring-boot-devtools")
//    annotationProcessor("org.projectlombok:lombok")
//    testImplementation("org.springframework.boot:spring-boot-starter-webmvc-test")
//    testImplementation ("org.junit.jupiter:junit-jupiter")
//    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
//
//    /*
//    implementation 'org.springframework.boot:spring-boot-starter-web'
//	testImplementation 'org.springframework.boot:spring-boot-starter-test'
//	developmentOnly 'org.springframework.boot:spring-boot-devtools'
//	compileOnly 'org.projectlombok:lombok'
//	annotationProcessor 'org.projectlombok:lombok'
//	runtimeOnly 'com.h2database:h2'
//	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
//	testImplementation 'org.junit.jupiter:junit-jupiter'
//	testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
//	implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
//	implementation 'nz.net.ultraq.thymeleaf:thymeleaf-layout-dialect'
//	implementation 'org.springframework.boot:spring-boot-starter-validation'
//	implementation 'org.springframework.boot:spring-boot-starter-security'
//	implementation 'org.thymeleaf.extras:thymeleaf-extras-springsecurity6'
//	implementation 'org.commonmark:commonmark:0.21.0'
//	runtimeOnly 'org.postgresql:postgresql'
//     */
//}

dependencies {
    implementation("org.springframework.boot:spring-boot-h2console")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-webmvc")
    compileOnly("org.projectlombok:lombok")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    runtimeOnly("com.h2database:h2")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-data-jpa-test")
    testImplementation("org.springframework.boot:spring-boot-starter-webmvc-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testImplementation ("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly ("org.junit.platform:junit-platform-launcher")
    implementation ("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("nz.net.ultraq.thymeleaf:thymeleaf-layout-dialect:4.0.0")
    implementation ("org.springframework.boot:spring-boot-starter-validation")
    //implementation("org.springframework.boot:spring-boot-starter-security")
    //implementation("org.thymeleaf.extras:thymeleaf-extras-springsecurity6")
    //testImplementation("org.springframework.security:spring-security-test")
    implementation("org.commonmark:commonmark:0.21.0")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
