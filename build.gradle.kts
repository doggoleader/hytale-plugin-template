plugins {
    id("java")
    id("com.gradleup.shadow") version "9.3.1"
}

java {
    toolchain.languageVersion = JavaLanguageVersion.of(25)
    withSourcesJar()
    withJavadocJar()
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    compileOnly(files("libs/HytaleServer.jar"))
    implementation("commons-io:commons-io:2.6")
}

tasks.shadowJar {
    archiveClassifier.set("")

}

tasks.build {
    dependsOn(tasks.shadowJar)
}

tasks.test {
    useJUnitPlatform()
}