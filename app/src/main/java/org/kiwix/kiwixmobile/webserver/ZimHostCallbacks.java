package org.kiwix.kiwixmobile.webserver;

import android.net.wifi.WifiConfiguration;
import androidx.annotation.NonNull;

public interface ZimHostCallbacks {

  void onServerStarted(@NonNull String ip);

  void onServerStopped();

  void onServerFailedToStart();

  void onIpAddressValid();

  void onIpAddressInvalid();
}
