package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private List<Request> requests = new ArrayList<>();
    private int nextId = 1;

    public Request add(Request request) {
        request.setId(nextId++);
        requests.add(request);
        return request;
    }

    public boolean replace(int id, Request newRequest) {
        for (int i = 0; i < requests.size(); i++) {
            if (requests.get(i).getId() == id) {
                newRequest.setId(id);
                requests.set(i, newRequest);
                return true;
            }
        }
        return false;
    }

    public boolean delete(int id) {
        for (int i = 0; i < requests.size(); i++) {
            if (requests.get(i).getId() == id) {
                requests.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<Request> findAll() {
        return new ArrayList<>(requests);
    }

    public List<Request> findByName(String key) {
        List<Request> result = new ArrayList<>();
        for (Request r: requests) {
            if (r.getName().equals(key)) {
                result.add(r);
            }
        }
        return result;
    }

    public Request findById(int id) {
        for (Request r : requests) {
            if (r.getId() == id) {
                return r;
            }
        }
        return null;
    }
}