package com.laboratoryv1;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.oblador.vectoricons.VectorIconsPackage;
import com.horcrux.svg.SvgPackage;
import com.reactnativenavigation.bridge.NavigationReactPackage;
import com.rssignaturecapture.RSSignatureCapturePackage;
import io.sentry.RNSentryPackage;
import org.wonday.pdf.RCTPdfView;
import com.reactnativenavigation.NavigationReactPackage;
import com.babisoft.ReactNativeLocalization.ReactNativeLocalizationPackage;
import fr.bamlab.rnimageresizer.ImageResizerPackage;
import com.jimmydaddy.imagemarker.ImageMarkerPackage;
import fr.snapp.imagebase64.RNImgToBase64Package;
import com.rnfs.RNFSPackage;
import com.RNFetchBlob.RNFetchBlobPackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import org.reactnative.camera.RNCameraPackage;
import com.parryworld.rnappupdate.RNAppUpdatePackage;
import com.appsflyer.reactnative.RNAppsFlyerPackage;
import com.appsee.reactnative.AppseeReactPackage;
import com.microsoft.appcenter.reactnative.crashes.AppCenterReactNativeCrashesPackage;
import com.microsoft.appcenter.reactnative.analytics.AppCenterReactNativeAnalyticsPackage;
import com.microsoft.appcenter.reactnative.appcenter.AppCenterReactNativePackage;
import com.PTR.IDFA.IDFAPackage;
import com.swmansion.gesturehandler.react.RNGestureHandlerPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new VectorIconsPackage(),
            new SvgPackage(),
            new RSSignatureCapturePackage(),
            new RNSentryPackage(MainApplication.this),
            new RCTPdfView(),
            new NavigationReactPackage(),
            new ReactNativeLocalizationPackage(),
            new ImageResizerPackage(),
            new ImageMarkerPackage(),
            new RNImgToBase64Package(),
            new RNFSPackage(),
            new RNFetchBlobPackage(),
            new RNDeviceInfo(),
            new RNCameraPackage(),
            new RNAppUpdatePackage(),
            new RNAppsFlyerPackage(),
            new AppseeReactPackage(),
            new AppCenterReactNativeCrashesPackage(MainApplication.this, getResources().getString(R.string.appCenterCrashes_whenToSendCrashes)),
            new AppCenterReactNativeAnalyticsPackage(MainApplication.this, getResources().getString(R.string.appCenterAnalytics_whenToEnableAnalytics)),
            new AppCenterReactNativePackage(MainApplication.this),
            new IDFAPackage(),
            new RNGestureHandlerPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
