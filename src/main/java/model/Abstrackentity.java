package model;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Data
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class Abstrackentity implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@CreatedDate
	@Column(name="creationDate", nullable=false)
	@JsonIgnore
	private Instant creationDate;
	@LastModifiedDate
	@Column(name="lastModifiesDate")
	@JsonIgnore
	private Instant lastModifiedDate;

}
