package ga;

import android.content.Context;
import c00.InterfaceC4769p;
import com.google.gson.reflect.TypeToken;
import com.kubi.advert.api.IAdvertService;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.C27099x;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ga.b */
/* JADX INFO: compiled from: KCHybridBridgeTrackCallImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J\u001e\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/advert/hybrid/KCHybridBridgeTrackCallImpl;", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeTrackCall;", "<init>", "()V", "afTrack", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "eventId", "", ReportDataTable.COLUMN_PARAMS, TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "tryParseParams", "", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCHybridBridgeTrackCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCHybridBridgeTrackCallImpl.kt\ncom/kubi/advert/hybrid/KCHybridBridgeTrackCallImpl\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,35:1\n149#2:36\n*S KotlinDebug\n*F\n+ 1 KCHybridBridgeTrackCallImpl.kt\ncom/kubi/advert/hybrid/KCHybridBridgeTrackCallImpl\n*L\n29#1:36\n*E\n"})
public final class C37850b implements InterfaceC4769p {

    /* JADX INFO: renamed from: ga.b$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes62.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class a extends TypeToken<Map<String, ? extends String>> {
    }

    @Override // c00.InterfaceC4769p
    /* JADX INFO: renamed from: a */
    public void mo4822a(@NotNull Context ctx, @Nullable Object obj, @NotNull String eventId, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IAdvertService.f15070a.get().mo14765g(eventId, m85410b(str));
        callback.invoke(Boolean.TRUE, null);
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, String> m85410b(String str) {
        if (str == null || str.length() == 0) {
            return MapsKt.emptyMap();
        }
        try {
            C27099x c27099x = C27099x.f54458a;
            return (Map) C27099x.m66914d(str, new a().getType());
        } catch (Exception unused) {
            return MapsKt.emptyMap();
        }
    }
}
