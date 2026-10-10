package p257fa;

import com.google.gson.reflect.TypeToken;
import com.kubi.advert.api.IAdvertService;
import com.kubi.utils.C27099x;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p741wy.InterfaceC45942b;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: fa.a */
/* JADX INFO: compiled from: FlutterAppFlyerTrackTransmit.kt */
/* JADX INFO: loaded from: classes62.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/advert/flutter/FlutterAppFlyerTrackTransmit;", "Lcom/kubi/sdk/flutter/transmit/IAppFlyerTrackTransmit;", "<init>", "()V", "track", "", "eventId", "", ReportDataTable.COLUMN_PARAMS, "tryParseParams", "", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlutterAppFlyerTrackTransmit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterAppFlyerTrackTransmit.kt\ncom/kubi/advert/flutter/FlutterAppFlyerTrackTransmit\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,28:1\n149#2:29\n*S KotlinDebug\n*F\n+ 1 FlutterAppFlyerTrackTransmit.kt\ncom/kubi/advert/flutter/FlutterAppFlyerTrackTransmit\n*L\n21#1:29\n*E\n"})
public final class C37406a implements InterfaceC45942b {

    /* JADX INFO: renamed from: fa.a$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class a extends TypeToken<Map<String, ? extends String>> {
    }

    @Override // p741wy.InterfaceC45942b
    /* JADX INFO: renamed from: m */
    public void mo84139m(@NotNull String eventId, @NotNull String params) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(params, "params");
        IAdvertService.f15070a.get().mo14765g(eventId, m84140q(params));
    }

    /* JADX INFO: renamed from: q */
    public final Map<String, String> m84140q(String str) {
        if (str.length() == 0) {
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
