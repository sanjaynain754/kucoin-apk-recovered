package p295h;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p387k.C40833h;

/* JADX INFO: renamed from: h.b */
/* JADX INFO: loaded from: classes23.dex */
public class C38063b {

    /* JADX INFO: renamed from: b */
    public Context f85679b;

    /* JADX INFO: renamed from: d */
    public long f85681d;

    /* JADX INFO: renamed from: e */
    public final int f85682e = 1500;

    /* JADX INFO: renamed from: f */
    public boolean f85683f = true;

    /* JADX INFO: renamed from: a */
    public MediaPlayer f85678a = new MediaPlayer();

    /* JADX INFO: renamed from: c */
    public Handler f85680c = new a(Looper.getMainLooper());

    /* JADX INFO: renamed from: h.b$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1500 && C38063b.this.f85680c != null) {
                C38063b.this.m85948f(((Integer) message.obj).intValue(), true, C38063b.this.f85681d);
            }
        }
    }

    /* JADX INFO: renamed from: h.b$b */
    public class b implements MediaPlayer.OnPreparedListener {
        public b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                C38063b.this.f85678a.start();
            } catch (Exception e11) {
                C40833h.m89363g("start media player failed:" + e11.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: h.b$c */
    public class c implements MediaPlayer.OnCompletionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f85686a;

        public c(int i11) {
            this.f85686a = i11;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            C38063b.this.m85946b(this.f85686a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m85946b(int i11) {
        if (this.f85680c != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1500;
            messageObtain.obj = Integer.valueOf(i11);
            this.f85680c.sendMessageDelayed(messageObtain, this.f85681d);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m85947e() {
        Handler handler = this.f85680c;
        if (handler != null) {
            handler.removeMessages(1500);
        }
        this.f85680c = null;
        this.f85679b = null;
        MediaPlayer mediaPlayer = this.f85678a;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.reset();
                this.f85678a.release();
                this.f85678a = null;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m85948f(int i11, boolean z11, long j11) {
        if (this.f85678a == null || i11 == -1 || !this.f85683f) {
            return;
        }
        this.f85681d = j11;
        m85949g();
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f85679b.getResources().openRawResourceFd(i11);
            this.f85678a.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
            assetFileDescriptorOpenRawResourceFd.close();
            this.f85678a.setOnPreparedListener(new b());
            if (z11) {
                this.f85678a.setOnCompletionListener(new c(i11));
            }
            this.f85678a.prepareAsync();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public void m85949g() {
        Handler handler = this.f85680c;
        if (handler != null) {
            handler.removeMessages(1500);
        }
        MediaPlayer mediaPlayer = this.f85678a;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.reset();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m85950h(boolean z11) {
        this.f85683f = z11;
        if (z11) {
            return;
        }
        m85949g();
    }

    public C38063b(Context context) {
        this.f85679b = context;
    }
}
