package com.facebook.internal;

import android.content.Intent;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CallbackManagerImpl.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/facebook/internal/CallbackManagerImpl;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class CallbackManagerImpl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<Integer, InterfaceC5746a> f9552b = new HashMap();

    /* JADX INFO: compiled from: CallbackManagerImpl.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m90084d2 = {"Lcom/facebook/internal/CallbackManagerImpl$Companion;", "", "<init>", "()V", "", "requestCode", "Lcom/facebook/internal/CallbackManagerImpl$a;", TUIConstants.TUIChat.CALL_BACK, "", "registerStaticCallback", "(ILcom/facebook/internal/CallbackManagerImpl$a;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)Lcom/facebook/internal/CallbackManagerImpl$a;", "resultCode", "Landroid/content/Intent;", "data", "", "b", "(IILandroid/content/Intent;)Z", "", "staticCallbacks", "Ljava/util/Map;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final synchronized InterfaceC5746a m9927a(int requestCode) {
            return (InterfaceC5746a) CallbackManagerImpl.f9552b.get(Integer.valueOf(requestCode));
        }

        @JvmStatic
        public final synchronized void registerStaticCallback(int requestCode, @NotNull InterfaceC5746a callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (CallbackManagerImpl.f9552b.containsKey(Integer.valueOf(requestCode))) {
                return;
            }
            CallbackManagerImpl.f9552b.put(Integer.valueOf(requestCode), callback);
        }

        public Companion() {
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final boolean m9928b(int requestCode, int resultCode, Intent data) {
            InterfaceC5746a interfaceC5746aM9927a = m9927a(requestCode);
            if (interfaceC5746aM9927a != null) {
                return interfaceC5746aM9927a.m9929a(resultCode, data);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.CallbackManagerImpl$a */
    /* JADX INFO: compiled from: CallbackManagerImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/facebook/internal/CallbackManagerImpl$a;", "", "", "resultCode", "Landroid/content/Intent;", "data", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ILandroid/content/Intent;)Z", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface InterfaceC5746a {
        /* JADX INFO: renamed from: a */
        boolean m9929a(int resultCode, @Nullable Intent data);
    }
}
