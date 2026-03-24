These instructions are for building tor-android on a Debian based system.

First install the prerequisite packages:

```bash
sudo apt install autotools-dev automake
sudo apt install autogen autoconf libtool gettext-base autopoint
sudo apt install git make g++ pkg-config
sudo apt intsall pkg-config
```

You'll need a valid JDK setup on your system. An extremely easy way to do this is to [install SDKMAN](https://sdkman.io/). With SDKMAN installed, you can configure Java 25 like so:

```bash
sdk init 
sdk install java 25.0.2-tem
``` 

Then obtain the Android SDK and NDK. The Android SDK is installed by default with Android Studio, and the NDK can be downloaded from within Android Studio's SDK manager.

for now, tor-android is built with NDK toolchain 28.2.13676358

Then set these environment variables for the SDK and NDK:

```bash
export ANDROID_HOME=~/Android/Sdk
export ANDROID_NDK_HOME=~/Android/Sdk/ndk/25.2.9519653
```

Be sure that you have all of the git submodules up-to-date:
```bash
./tor-droid-make.sh fetch -c
```

To build, run:
```bash
# make a universal tor-android library for every supported architecture
./tor-droid-make.sh build 
# make a tor-android library for particular architectures from: arm64-v8a armeabi-v7a x86 x86_64

# 64 bit ARM APK, for running on devices
./tor-droid-make.sh build -a arm64-v8a

# 64 bit Intel APK, for running on emulators with Intel hosts
./tor-droid-make build -a x86_64 
```

This will produce an unsigned tor-android AAR.

