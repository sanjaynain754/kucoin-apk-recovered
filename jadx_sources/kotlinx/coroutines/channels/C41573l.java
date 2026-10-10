package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import com.appsflyer.AppsFlyerProperties;
import com.tencent.rmonitor.custom.ICustomDataEditor;
import kotlinx.coroutines.C41701k0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.l */
/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m90084d2 = {"Lkotlinx/coroutines/channels/l;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/e;", "Lkotlinx/coroutines/channels/m;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lkotlinx/coroutines/channels/d;", AppsFlyerProperties.CHANNEL, "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/d;)V", "", "value", ICustomDataEditor.STRING_ARRAY_PARAM_1, "(Lkotlin/Unit;)V", "", "cause", "", "handled", "V0", "(Ljava/lang/Throwable;Z)V", "isActive", "()Z", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41573l<E> extends C41566e<E> implements InterfaceC41574m<E> {
    public C41573l(@NotNull CoroutineContext coroutineContext, @NotNull InterfaceC41565d<E> interfaceC41565d) {
        super(coroutineContext, interfaceC41565d, true, true);
    }

    @Override // kotlinx.coroutines.AbstractC41539a
    /* JADX INFO: renamed from: V0 */
    public void mo90472V0(@NotNull Throwable cause, boolean handled) {
        if (!m90689Z0().mo90553F(cause) && !handled) {
            C41701k0.m91111a(get$context(), cause);
        }
    }

    @Override // kotlinx.coroutines.AbstractC41539a
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public void mo90473W0(@NotNull Unit value) {
        InterfaceC41577p.a.m90714a(m90689Z0(), null, 1, null);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41574m
    public /* bridge */ /* synthetic */ InterfaceC41577p getChannel() {
        return m90688Y0();
    }

    @Override // kotlinx.coroutines.AbstractC41539a, kotlinx.coroutines.JobSupport, kotlinx.coroutines.InterfaceC41775x1
    public boolean isActive() {
        return super.isActive();
    }
}
