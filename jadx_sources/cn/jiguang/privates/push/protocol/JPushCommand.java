package cn.jiguang.privates.push.protocol;

/* JADX INFO: loaded from: classes34.dex */
public interface JPushCommand {

    public interface Alias {
        public static final int COMMAND = 29;
        public static final int VERSION = 1;
    }

    public interface Message {
        public static final int COMMAND = 3;
        public static final int VERSION = 1;
    }

    public interface MessageReceipt {
        public static final int COMMAND = 4;
        public static final int VERSION = 2;
    }

    public interface MessageRevoke {
        public static final int COMMAND = 59;
        public static final int VERSION = 1;
    }

    public interface MobileNumber {
        public static final int COMMAND = 7;
        public static final int VERSION = 1;
    }

    public interface PlatformToken {
        public static final int COMMAND = 27;
        public static final int VERSION = 1;
    }

    public interface Tag {
        public static final int COMMAND = 28;
        public static final int VERSION = 1;
    }

    public interface UserCtrl {
        public static final int COMMAND = 26;
        public static final int VERSION = 1;
    }
}
