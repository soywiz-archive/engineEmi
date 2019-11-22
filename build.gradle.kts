import com.soywiz.korge.gradle.*


buildscript {


    repositories {
        jcenter()
        mavenLocal()
        maven { url = uri("https://dl.bintray.com/soywiz/soywiz") }
        maven { url = uri("https://plugins.gradle.org/m2/") }
        mavenCentral()
    }
    dependencies {
        classpath("com.soywiz:korge-gradle-plugin:1.2.0")

    }
}

apply(plugin = "korge")



korge {
    id = "com.soywiz.sample1"
    name = "Sample1"
    description = "A sample using Korge and the gradle plugin"
    orientation = Orientation.LANDSCAPE
    jvmMainClassName = "MainKt"



    admob("ca-app-pub-xxxxxxxx~yyyyyy")

    supportShapeOps()
    supportTriangulation()
    supportDragonbones()
    supportBox2d()
}


tasks.register<Copy>("copyHtmlToBuildfolder"){
    group = "engineemi"
    from("src/html/")
    into("${buildDir}/web/")

    mustRunAfter("jsWeb")
}


tasks.register<DefaultTask>("openInBrowser"){
    group = "engineemi"
 //   dependsOn("compileKotlinJs")
  //  dependsOn("genResources")
   // dependsOn("jsProcessResources")
   // dependsOn("jsMainClasses")
   // dependsOn("jsJar")
   // dependsOn("jsWeb")
   // dependsOn("copyHtmlToBuildfolder")


    dependsOn("jsWebRun")
}

tasks.register<DefaultTask>("openLocal"){
    group = "engineemi"
    //   dependsOn("compileKotlinJs")
    //  dependsOn("genResources")
    // dependsOn("jsProcessResources")
    // dependsOn("jsMainClasses")
    // dependsOn("jsJar")
    // dependsOn("jsWeb")
    // dependsOn("copyHtmlToBuildfolder")


    dependsOn("runJvm")
}







//kotlin.sourceSets["commonMain"].resources.srcDir("src")
kotlin.sourceSets["commonMain"].kotlin.srcDir("src")
kotlin.sourceSets["commonMain"].resources.srcDir("resources")
