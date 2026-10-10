package p514ou;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.kubi.permissions.compliance.PermissionComplianceFragment;
import com.kubi.utils.C27059l;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.lang.NoAspectBoundException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ou.a */
/* JADX INFO: compiled from: PermissionComplianceAspect.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/permissions/aspect/PermissionComplianceAspect;", "", "<init>", "()V", "requestPermissions", "", "point", "Lorg/aspectj/lang/JoinPoint;", "onRequestPermissionsResult", "getFragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "LPermissions_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43330a {

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Throwable f95647a;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C43330a f95648b;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m95367a() {
        f95648b = new C43330a();
    }

    /* JADX INFO: renamed from: b */
    public static C43330a m95368b() {
        C43330a c43330a = f95648b;
        if (c43330a != null) {
            return c43330a;
        }
        throw new NoAspectBoundException("com.kubi.permissions.aspect.PermissionComplianceAspect", f95647a);
    }

    /* JADX INFO: renamed from: d */
    public final void m95370d(@NotNull InterfaceC43175a point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        PermissionComplianceFragment.Companion companion = PermissionComplianceFragment.f40522W;
        FragmentActivity fragmentActivityM95369c = m95369c(point);
        if (fragmentActivityM95369c == null) {
            return;
        }
        companion.hide(fragmentActivityM95369c);
    }

    /* JADX INFO: renamed from: e */
    public final void m95371e(@NotNull InterfaceC43175a point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        PermissionComplianceFragment.Companion companion = PermissionComplianceFragment.f40522W;
        FragmentActivity fragmentActivityM95369c = m95369c(point);
        if (fragmentActivityM95369c == null) {
            return;
        }
        Object obj = point.mo82131b()[0];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        companion.show(fragmentActivityM95369c, (String[]) obj);
    }

    static {
        try {
            m95367a();
        } catch (Throwable th2) {
            f95647a = th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final FragmentActivity m95369c(InterfaceC43175a interfaceC43175a) {
        Object objM66757a;
        Object target = interfaceC43175a.getTarget();
        if (target instanceof FragmentActivity) {
            objM66757a = interfaceC43175a.getTarget();
        } else if (target instanceof Fragment) {
            Object target2 = interfaceC43175a.getTarget();
            Intrinsics.checkNotNull(target2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
            objM66757a = ((Fragment) target2).getActivity();
        } else {
            objM66757a = C27059l.f54343a.m66757a();
        }
        if (objM66757a instanceof FragmentActivity) {
            return (FragmentActivity) objM66757a;
        }
        return null;
    }
}
