package q90;

import androidx.annotation.NonNull;
import com.otaliastudios.transcoder.internal.transcode.TranscodeEngine;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import w90.C45772k;

/* JADX INFO: renamed from: q90.c */
/* JADX INFO: compiled from: Transcoder.java */
/* JADX INFO: loaded from: classes59.dex */
public class C43672c {

    /* JADX INFO: renamed from: q90.c$a */
    /* JADX INFO: compiled from: Transcoder.java */
    public class a implements Callable<Void> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C43674e f96481b;

        public a(C43674e c43674e) {
            this.f96481b = c43674e;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            TranscodeEngine.m68066c(this.f96481b);
            return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43672c m96094a() {
        return new C43672c();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C43674e.b m96095b(@NonNull String str) {
        return new C43674e.b(str);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public Future<Void> m96096c(@NonNull C43674e c43674e) {
        return C45772k.m101086a().submit(new a(c43674e));
    }
}
