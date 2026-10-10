package sg0;

import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: sg0.a */
/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lsg0/a;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", "r", "", "execute", "(Ljava/lang/Runnable;)V", "kotlinx-coroutines-play-services"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class ExecutorC44408a implements Executor {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ExecutorC44408a f98091b = new ExecutorC44408a();

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable r11) {
        r11.run();
    }
}
