package kotlinx.coroutines;

import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;

/* JADX INFO: renamed from: kotlinx.coroutines.y1 */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\t¨\u0006\u0010"}, m90084d2 = {"Lkotlinx/coroutines/y1;", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/z;", "Lkotlinx/coroutines/x1;", "parent", "<init>", "(Lkotlinx/coroutines/x1;)V", "", "U0", "()Z", "d", "Z", "e0", "handlesException", "g0", "onCancelComplete", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@PublishedApi
public class C41779y1 extends JobSupport implements InterfaceC41781z {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean handlesException;

    public C41779y1(@Nullable InterfaceC41775x1 interfaceC41775x1) {
        super(true);
        m90431p0(interfaceC41775x1);
        this.handlesException = m91390U0();
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: g0 */
    public boolean mo90422g0() {
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: e0, reason: from getter */
    public boolean getHandlesException() {
        return this.handlesException;
    }

    /* JADX INFO: renamed from: U0 */
    public final boolean m91390U0() {
        C41761u c41761u;
        JobSupport jobSupportM90479t;
        C41761u c41761u2;
        InterfaceC41757t interfaceC41757tM90427j0 = m90427j0();
        if (interfaceC41757tM90427j0 instanceof C41761u) {
            c41761u = (C41761u) interfaceC41757tM90427j0;
        } else {
            c41761u = null;
        }
        if (c41761u != null && (jobSupportM90479t = c41761u.m90479t()) != null) {
            while (!jobSupportM90479t.getHandlesException()) {
                InterfaceC41757t interfaceC41757tM90427j1 = jobSupportM90479t.m90427j0();
                if (interfaceC41757tM90427j1 instanceof C41761u) {
                    c41761u2 = (C41761u) interfaceC41757tM90427j1;
                } else {
                    c41761u2 = null;
                }
                if (c41761u2 == null || (jobSupportM90479t = c41761u2.m90479t()) == null) {
                }
            }
            return true;
        }
        return false;
    }
}
