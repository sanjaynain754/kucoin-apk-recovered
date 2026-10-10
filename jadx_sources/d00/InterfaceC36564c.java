package d00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: d00.c */
/* JADX INFO: compiled from: KCJSApiCalendarModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\bg\u0018\u00002\u00020\u0001JG\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bH&¢\u0006\u0004\b\f\u0010\rJG\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bH&¢\u0006\u0004\b\u000e\u0010\rJg\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000f2(\u0010\u000b\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bH&¢\u0006\u0004\b\u0011\u0010\u0012Jo\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000f2(\u0010\u000b\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bH&¢\u0006\u0004\b\u0014\u0010\u0015Jg\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000f2(\u0010\u000b\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bH&¢\u0006\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, m90084d2 = {"Ld00/c;", "", "Landroid/content/Context;", "ctx", "Ljava/lang/Object;", "obj", "", "source", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "e", "", "data", "b", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;)V", "eventType", "d", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;)V", "c", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC36564c {
    /* JADX INFO: renamed from: a */
    void mo31537a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo31538b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Map<String, ? extends Object> data, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo31539c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Map<String, ? extends Object> data, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: d */
    void mo31540d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String eventType, @NotNull Map<String, ? extends Object> data, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: e */
    void mo31541e(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback);
}
