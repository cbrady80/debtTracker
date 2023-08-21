import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.20"
    application
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("aws.sdk.kotlin:s3:0.9.4-beta")
    implementation("aws.sdk.kotlin:dynamodb:0.9.4-beta")
    implementation("aws.sdk.kotlin:iam:0.9.4-beta")
    implementation("aws.sdk.kotlin:cloudwatch:0.9.4-beta")
    implementation("aws.sdk.kotlin:cognito:0.9.4-beta")
    implementation("aws.sdk.kotlin:sns:0.9.4-beta")
    implementation("aws.sdk.kotlin:pinpoint:0.9.4-beta")
    testImplementation(kotlin("test"))
}
tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
