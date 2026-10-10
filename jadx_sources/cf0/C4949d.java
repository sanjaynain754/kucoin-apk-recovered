package cf0;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.webkit.ProxyConfig;

/* JADX INFO: renamed from: cf0.d */
/* JADX INFO: compiled from: LinkResolverDef.java */
/* JADX INFO: loaded from: classes60.dex */
public class C4949d implements InterfaceC4948c {
    @NonNull
    private static Uri parseLink(@NonNull String str) {
        Uri uri = Uri.parse(str);
        if (TextUtils.isEmpty(uri.getScheme())) {
            return uri.buildUpon().scheme(ProxyConfig.MATCH_HTTPS).build();
        }
        return uri;
    }

    @Override // cf0.InterfaceC4948c
    public void resolve(@NonNull View view, @NonNull String str) {
        Uri link = parseLink(str);
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", link);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.w("LinkResolverDef", "Actvity was not found for the link: '" + str + "'");
        }
    }
}
