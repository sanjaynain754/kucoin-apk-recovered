package p219e2;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import p280g2.C37790c;
import p523p2.C43363j;
import p680v1.InterfaceC45356g;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: e2.b */
/* JADX INFO: compiled from: DrawableResource.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC37046b<T extends Drawable> implements InterfaceC45359j<T>, InterfaceC45356g {

    /* JADX INFO: renamed from: b */
    public final T f82301b;

    @Override // p680v1.InterfaceC45359j
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f82301b.getConstantState();
        return constantState == null ? this.f82301b : (T) constantState.newDrawable();
    }

    @Override // p680v1.InterfaceC45356g
    public void initialize() {
        T t11 = this.f82301b;
        if (t11 instanceof BitmapDrawable) {
            ((BitmapDrawable) t11).getBitmap().prepareToDraw();
        } else if (t11 instanceof C37790c) {
            ((C37790c) t11).m85256e().prepareToDraw();
        }
    }

    public AbstractC37046b(T t11) {
        this.f82301b = (T) C43363j.m95506d(t11);
    }
}
