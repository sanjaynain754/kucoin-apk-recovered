package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.messaging.Constants;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class LocalizationChannel {
    private static final String TAG = "LocalizationChannel";

    @NonNull
    public final MethodChannel channel;

    @NonNull
    @VisibleForTesting
    public final MethodChannel.MethodCallHandler handler;

    @Nullable
    private LocalizationMessageHandler localizationMessageHandler;

    public interface LocalizationMessageHandler {
        @NonNull
        String getStringResource(@NonNull String str, @NonNull String str2);
    }

    public void sendLocales(@NonNull List<Locale> list) {
        Log.m87481v(TAG, "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale locale : list) {
            Log.m87481v(TAG, "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(locale.getScript());
            arrayList.add(locale.getVariant());
        }
        this.channel.invokeMethod("setLocale", arrayList);
    }

    public void setLocalizationMessageHandler(@Nullable LocalizationMessageHandler localizationMessageHandler) {
        this.localizationMessageHandler = localizationMessageHandler;
    }

    public LocalizationChannel(@NonNull DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.LocalizationChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                String string;
                if (LocalizationChannel.this.localizationMessageHandler != null) {
                    String str = methodCall.method;
                    str.getClass();
                    if (!str.equals("Localization.getStringResource")) {
                        result.notImplemented();
                        return;
                    }
                    JSONObject jSONObject = (JSONObject) methodCall.arguments();
                    try {
                        String string2 = jSONObject.getString("key");
                        if (jSONObject.has("locale")) {
                            string = jSONObject.getString("locale");
                        } else {
                            string = null;
                        }
                        result.success(LocalizationChannel.this.localizationMessageHandler.getStringResource(string2, string));
                    } catch (JSONException e11) {
                        result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e11.getMessage(), null);
                    }
                }
            }
        };
        this.handler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/localization", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }
}
