package cn.jiguang.privates.core.protocol;

/* JADX INFO: loaded from: classes34.dex */
public interface JCoreCommand {

    public interface Ack {
        public static final int COMMAND = 19;
        public static final int VERSION = 1;
    }

    public interface Ctrl {
        public static final int COMMAND = 25;
        public static final int VERSION = 1;
    }

    public interface Heartbeat {
        public static final int COMMAND = 2;
        public static final int VERSION = 4;
    }

    public interface Login {
        public static final int COMMAND = 1;
        public static final int VERSION = 23;
    }

    public interface Register {
        public static final int COMMAND = 0;
        public static final int VERSION = 19;
    }
}
