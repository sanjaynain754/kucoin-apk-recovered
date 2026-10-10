package ga;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.kubi.advert.api.IAdvertService;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.C27099x;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import e00.InterfaceC37019k;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ga.a */
/* JADX INFO: compiled from: KCBridgeTrackCallImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\fH\u0016J\u001e\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/advert/hybrid/KCBridgeTrackCallImpl;", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeTrackCall;", "<init>", "()V", "afTrack", "", "ctx", "Landroid/content/Context;", "eventId", "", ReportDataTable.COLUMN_PARAMS, TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "tryParseParams", "", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCBridgeTrackCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCBridgeTrackCallImpl.kt\ncom/kubi/advert/hybrid/KCBridgeTrackCallImpl\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,34:1\n149#2:35\n*S KotlinDebug\n*F\n+ 1 KCBridgeTrackCallImpl.kt\ncom/kubi/advert/hybrid/KCBridgeTrackCallImpl\n*L\n28#1:35\n*E\n"})
public final class C37849a implements InterfaceC37019k {

    /* JADX INFO: renamed from: ga.a$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes62.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class a extends TypeToken<Map<String, ? extends String>> {
    }

    @Override // e00.InterfaceC37019k
    /* JADX INFO: renamed from: a */
    public void mo82847a(@NotNull Context ctx, @NotNull String eventId, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IAdvertService.f15070a.get().mo14765g(eventId, m85409b(str));
        callback.invoke(Boolean.TRUE, null);
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, String> m85409b(String str) {
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
