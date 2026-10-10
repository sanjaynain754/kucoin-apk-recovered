package d00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSocketJsHybridSocketHttpTaskParams;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSocketJsPlainSocketTaskParams;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSocketJsPollingSocketTaskParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: d00.a0 */
/* JADX INFO: compiled from: KCJSApiSocketJsModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J[\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2(\u0010\u000e\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b\u000f\u0010\u0010J[\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00112(\u0010\u000e\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b\u0012\u0010\u0013J[\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00142(\u0010\u000e\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b\u0015\u0010\u0016J]\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172(\u0010\u000e\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b\u0019\u0010\u001aJS\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062(\u0010\u000e\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m90084d2 = {"Ld00/a0;", "", "Landroid/content/Context;", "ctx", "Ljava/lang/Object;", "obj", "", "source", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSocketJsPlainSocketTaskParams;", "task", "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "c", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSocketJsPlainSocketTaskParams;Lkotlin/jvm/functions/Function2;)V", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSocketJsPollingSocketTaskParams;", "d", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSocketJsPollingSocketTaskParams;Lkotlin/jvm/functions/Function2;)V", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSocketJsHybridSocketHttpTaskParams;", "e", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSocketJsHybridSocketHttpTaskParams;Lkotlin/jvm/functions/Function2;)V", "", "pollImmediate", "b", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC36561a0 {
    /* JADX INFO: renamed from: a */
    void mo31602a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo31603b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable Boolean pollImmediate, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo31604c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull KCJSApiSocketJsPlainSocketTaskParams task, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: d */
    void mo31605d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull KCJSApiSocketJsPollingSocketTaskParams task, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: e */
    void mo31606e(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull KCJSApiSocketJsHybridSocketHttpTaskParams task, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback);
}
