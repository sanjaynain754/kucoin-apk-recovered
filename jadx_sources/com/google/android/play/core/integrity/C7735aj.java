package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.integrity.internal.AbstractBinderC7831m;
import com.google.android.play.integrity.internal.C7810ae;
import com.google.android.play.integrity.internal.C7814ai;
import com.google.android.play.integrity.internal.C7822d;
import com.google.android.play.integrity.internal.C7837s;
import com.google.android.play.integrity.internal.InterfaceC7844z;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.aj */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7735aj {

    /* JADX INFO: renamed from: a */
    @Nullable
    @VisibleForTesting
    final C7810ae f11973a;

    /* JADX INFO: renamed from: b */
    private final C7837s f11974b;

    /* JADX INFO: renamed from: c */
    private final String f11975c;

    /* JADX INFO: renamed from: d */
    private final C7745at f11976d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC7783k f11977e;

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ Bundle m13224a(C7735aj c7735aj, byte[] bArr, Long l11, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c7735aj.f11975c);
        bundle.putByteArray(AuthenticationTokenClaims.JSON_KEY_NONCE, bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l11 != null) {
            bundle.putLong("cloud.prj", l11.longValue());
        }
        ArrayList arrayList = new ArrayList();
        C7822d.m13311b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(C7822d.m13310a(arrayList)));
        return bundle;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public final Task m13229b(Activity activity, Bundle bundle) {
        if (this.f11973a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i11 = bundle.getInt("dialog.intent.type");
        this.f11974b.m13326d("requestAndShowDialog(%s, %s)", this.f11975c, Integer.valueOf(i11));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f11973a.m13295t(new C7732ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i11), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: c */
    public final Task m13230c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f11973a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof C7740ao) {
            }
            this.f11974b.m13326d("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f11973a.m13295t(new C7731af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e11) {
            return Tasks.forException(new IntegrityServiceException(-13, e11));
        }
    }

    public C7735aj(Context context, C7837s c7837s, C7745at c7745at, InterfaceC7783k interfaceC7783k) {
        this.f11975c = context.getPackageName();
        this.f11974b = c7837s;
        this.f11976d = c7745at;
        this.f11977e = interfaceC7783k;
        if (!C7814ai.m13301b(context)) {
            c7837s.m13324b("Phonesky is not installed.", new Object[0]);
            this.f11973a = null;
        } else {
            this.f11973a = new C7810ae(context, c7837s, "IntegrityService", C7736ak.f11978a, new InterfaceC7844z() { // from class: com.google.android.play.core.integrity.ae
                @Override // com.google.android.play.integrity.internal.InterfaceC7844z
                /* JADX INFO: renamed from: a */
                public final Object mo13219a(IBinder iBinder) {
                    return AbstractBinderC7831m.m13321b(iBinder);
                }
            }, null);
        }
    }
}
