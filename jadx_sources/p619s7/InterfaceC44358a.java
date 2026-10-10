package p619s7;

import android.app.Application;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.forter.mobile.fortersdk.models.NavigationType;
import com.forter.mobile.fortersdk.models.TrackType;
import p587r7.C43935a;

/* JADX INFO: renamed from: s7.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC44358a {
    /* JADX INFO: renamed from: a */
    C43935a mo12061a();

    /* JADX INFO: renamed from: b */
    boolean mo12062b(@NonNull TrackType trackType);

    /* JADX INFO: renamed from: c */
    boolean mo12063c(boolean z11);

    /* JADX INFO: renamed from: d */
    boolean mo12064d(@NonNull NavigationType navigationType, @NonNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4);

    /* JADX INFO: renamed from: e */
    void mo12065e(@NonNull Application application, @NonNull String str, @NonNull String str2);

    /* JADX INFO: renamed from: f */
    boolean mo12066f(@NonNull TrackType trackType, @NonNull String str);

    void onLocationChanged(@NonNull Location location);
}
