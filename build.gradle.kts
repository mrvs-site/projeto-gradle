plugins {
    id("java")
    checkstyle
}

group = "dio.projeto"
version = "1.0-SNAPSHOT"

val mapStructVersion = "1.5.5.Final"
val lombokVersion = "1.18.34"
val lombokMapStructBinding = "0.2.0"

repositories {
    mavenCentral()
}

dependencies {

    implementation("org.mapstruct:mapstruct:$mapStructVersion")
    implementation("org.projectlombok:lombok-mapstruct-binding:$lombokMapStructBinding")

    compileOnly("org.projectlombok:lombok:$lombokVersion")

    annotationProcessor("org.mapstruct:mapstruct-processor:$mapStructVersion")
    annotationProcessor("org.projectlombok:lombok-mapstruct-binding:$lombokMapStructBinding")
    annotationProcessor("org.projectlombok:lombok:$lombokVersion")
}

tasks.withType<Checkstyle>().configureEach {
    reports{
        xml.required = true
        html.required = true
    }
}

tasks.checkstyleMain {
    source = fileTree("src/main/java")
}