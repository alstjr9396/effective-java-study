package me.minseok.effectivejava.chapter07;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class StringObjectReference<StringObject> extends PhantomReference<StringObject> {

    /**
     * Creates a new phantom reference that refers to the given object and is registered with the given queue.
     * It is possible to create a phantom reference with a null queue, but such a reference is completely useless: Its get method will always return null and, since it does not have a queue, it will never be enqueued.
     * @param referent the object the new phantom reference will refer to
     * @param q the queue with which the reference is to be registered, or null if registration is not required
     */
    public StringObjectReference(StringObject referent, ReferenceQueue<? super StringObject> q) {
        super(referent, q);
    }
}
