package com.blooddono.service;

import com.blooddono.dao.UserDao;
import com.blooddono.model.User;

public class UserService {
    private final UserDao dao = new UserDao();

    public User fetchByEmail(String email) {
        try {
            return dao.getUserByEmail(email);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] fetchProfilePic(String email) {
        try {
            return dao.getProfilePicByEmail(email);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean updateProfile(User u) {
        try {
            return dao.updateUser(u);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getLatestRequestStatus(int userId) {
        try {
            return dao.getLatestRequestStatus(userId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
