package eu.lilithmonodia.emaillistcleaner.emaillistcleaner.data;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class EmailList implements List<Email> {
    private final List<Email> emails;

    public EmailList() {
        emails = new ArrayList<>();
    }

    @Override
    public int size() {
        return emails.size();
    }

    @Override
    public boolean isEmpty() {
        return emails.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return emails.contains(o);
    }

    @NotNull
    @Override
    public Iterator<Email> iterator() {
        return emails.iterator();
    }

    @NotNull
    @Override
    public Object @NotNull [] toArray() {
        return emails.toArray();
    }

    @NotNull
    @Override
    public <T> T @NotNull [] toArray(@NotNull T @NotNull [] a) {
        return emails.toArray(a);
    }

    @Override
    public boolean add(Email e) {
        return emails.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return emails.remove(o);
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        return new HashSet<>(emails).containsAll(c);
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends Email> c) {
        return emails.addAll(c);
    }

    @Override
    public boolean addAll(int index, @NotNull Collection<? extends Email> c) {
        return emails.addAll(index, c);
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> c) {
        return emails.removeAll(c);
    }

    @Override
    public boolean retainAll(@NotNull Collection<?> c) {
        return emails.retainAll(c);
    }

    @Override
    public void clear() {
        emails.clear();
    }

    @Override
    public Email get(int index) {
        return emails.get(index);
    }

    @Override
    public Email set(int index, Email element) {
        return emails.set(index, element);
    }

    @Override
    public void add(int index, Email element) {
        emails.add(index, element);
    }

    @Override
    public Email remove(int index) {
        return emails.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return emails.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return emails.lastIndexOf(o);
    }

    @NotNull
    @Override
    public ListIterator<Email> listIterator() {
        return emails.listIterator();
    }

    @NotNull
    @Override
    public ListIterator<Email> listIterator(int index) {
        return emails.listIterator(index);
    }

    @NotNull
    @Override
    public List<Email> subList(int fromIndex, int toIndex) {
        return emails.subList(fromIndex, toIndex);
    }

    public void removeDuplicates() {
        Set<Email> emailSet = new HashSet<>(emails);
        emails.clear();
        emails.addAll(emailSet);
    }

    public void sort() {
        emails.sort(Email::compareTo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Email email : emails) {
            sb.append(email).append("\n");
        }
        return sb.toString();
    }
}
