package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.ConfigurationCompat;
import com.google.android.gms.base.C7046R;
import com.google.android.gms.common.C7048R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.tencent.bugly.proguard.C33590cg;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zac {

    @GuardedBy(C33590cg.f69440j)
    private static final SimpleArrayMap zaa = new SimpleArrayMap();

    @Nullable
    @GuardedBy(C33590cg.f69440j)
    private static Locale zab;

    @NonNull
    public static String zad(Context context, int i11) {
        return (i11 == 6 || i11 == 19) ? zag(context, "common_google_play_services_resolution_required_text", zaa(context)) : zac(context, i11);
    }

    @NonNull
    public static String zae(Context context, int i11) {
        String strZah = i11 == 6 ? zah(context, "common_google_play_services_resolution_required_title") : zaf(context, i11);
        return strZah == null ? context.getResources().getString(C7046R.string.common_google_play_services_notification_ticker) : strZah;
    }

    @Nullable
    private static String zah(Context context, String str) {
        SimpleArrayMap simpleArrayMap = zaa;
        synchronized (simpleArrayMap) {
            try {
                Locale locale = ConfigurationCompat.getLocales(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(zab)) {
                    simpleArrayMap.clear();
                    zab = locale;
                }
                String str2 = (String) simpleArrayMap.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
                if (remoteResource == null) {
                    return null;
                }
                int identifier = remoteResource.getIdentifier(str, TypedValues.Custom.S_STRING, "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = remoteResource.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    simpleArrayMap.put(str, string);
                    return string;
                }
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    @NonNull
    public static String zab(Context context, int i11) {
        Resources resources = context.getResources();
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return resources.getString(R.string.ok);
                }
                return resources.getString(C7046R.string.common_google_play_services_enable_button);
            }
            return resources.getString(C7046R.string.common_google_play_services_update_button);
        }
        return resources.getString(C7046R.string.common_google_play_services_install_button);
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    @NonNull
    public static String zac(Context context, int i11) {
        Resources resources = context.getResources();
        String strZaa = zaa(context);
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        if (i11 != 7) {
                            if (i11 != 9) {
                                if (i11 != 20) {
                                    switch (i11) {
                                        case 16:
                                            return zag(context, "common_google_play_services_api_unavailable_text", strZaa);
                                        case 17:
                                            return zag(context, "common_google_play_services_sign_in_failed_text", strZaa);
                                        case 18:
                                            return resources.getString(C7046R.string.common_google_play_services_updating_text, strZaa);
                                        default:
                                            return resources.getString(C7048R.string.common_google_play_services_unknown_issue, strZaa);
                                    }
                                }
                                return zag(context, "common_google_play_services_restricted_profile_text", strZaa);
                            }
                            return resources.getString(C7046R.string.common_google_play_services_unsupported_text, strZaa);
                        }
                        return zag(context, "common_google_play_services_network_error_text", strZaa);
                    }
                    return zag(context, "common_google_play_services_invalid_account_text", strZaa);
                }
                return resources.getString(C7046R.string.common_google_play_services_enable_text, strZaa);
            }
            if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                return resources.getString(C7046R.string.common_google_play_services_wear_update_text);
            }
            return resources.getString(C7046R.string.common_google_play_services_update_text, strZaa);
        }
        return resources.getString(C7046R.string.common_google_play_services_install_text, strZaa);
    }

    @Nullable
    public static String zaf(Context context, int i11) {
        Resources resources = context.getResources();
        switch (i11) {
            case 1:
                return resources.getString(C7046R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(C7046R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(C7046R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return zah(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return zah(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i11);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return zah(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return zah(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String zag(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strZah = zah(context, str);
        if (strZah == null) {
            strZah = resources.getString(C7048R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strZah, str2);
    }
}
