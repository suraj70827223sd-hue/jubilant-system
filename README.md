# Connect8 Infinity Android Launcher

This Android app opens the existing HTTPS Connect8 Infinity PWA in Chrome Custom Tabs instead of an embedded WebView, to preserve compatibility with OAuth and browser mic/camera permissions.

Website: https://connect8-infinity.suraj70827223sd.workers.dev/

**Important**: Google OAuth and SMS OTP require configuring the providers in the existing Supabase project. This Android APK is a launcher for the hosted web application, not an offline messenger or a native WebRTC reimplementation. No passwords or private keys are kept in this repository.

Workflow: Android APK (debug) -> artifact: connect8-infinity-android-debug
