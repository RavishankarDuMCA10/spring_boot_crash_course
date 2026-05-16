package com.rscoding.spring_boot_crash_course.databse.repository

import com.rscoding.spring_boot_crash_course.databse.model.Note
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface NoteRepository : MongoRepository<Note, ObjectId> {
    fun findByOwnerId(ownerId: ObjectId): List<Note>
}