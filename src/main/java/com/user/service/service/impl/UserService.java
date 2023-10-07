package com.user.service.service.impl;

import com.user.service.dto.UserRequestRecord;
import com.user.service.model.User;

public interface UserService {

    User createUser(UserRequestRecord userRequestRecord);
}
