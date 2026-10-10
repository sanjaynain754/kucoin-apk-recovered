package com.kubi.mvi.state;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import com.kubi.mvi.state.InterfaceC19284f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SyncIntent.kt */
/* JADX INFO: loaded from: classes29.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/mvi/state/SyncIntent;", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "", "Lcom/kubi/mvi/state/d;", "intent", "<init>", "(Lcom/kubi/mvi/state/d;)V", "any", "", DbParams.KEY_CHANNEL_RESULT, "(Lcom/kubi/mvi/state/f;)V", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kubi/mvi/state/d;", "getIntent", "()Lcom/kubi/mvi/state/d;", "Lkotlinx/coroutines/w;", "completableDeferred", "Lkotlinx/coroutines/w;", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class SyncIntent<S extends InterfaceC19284f> {

    @NotNull
    private final InterfaceC41769w<S> completableDeferred;

    @NotNull
    private final InterfaceC19282d intent;

    public SyncIntent(@NotNull InterfaceC19282d intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.intent = intent;
        this.completableDeferred = C41777y.m91388c(null, 1, null);
    }

    @Nullable
    public final Object await(@NotNull Continuation<? super S> continuation) {
        return this.completableDeferred.mo91198h(continuation);
    }

    @NotNull
    public final InterfaceC19282d getIntent() {
        return this.intent;
    }

    public final void result(@NotNull S any) {
        Intrinsics.checkNotNullParameter(any, "any");
        this.completableDeferred.mo91370n(any);
    }
}
